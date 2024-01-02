# -*- coding: utf-8 -*-
"""
Ce script est conçu pour effectuer des contrôles spécifiques sur des fichiers \
    de code, tels que la longueur des lignes et les Javadocs.
"""
import glob
import os
import re
import sys

# Workflow settings
EXIT_STATUS_SUCCESS = 0
EXIT_STATUS_FAILURE = 1

# Default settings
DEFAULT_RULER = 100


def print_error(line_num, message) -> None:
    print(f"\tLigne {line_num + 1:>3}: {message}")


def verify_javadoc(lines: list[str]):
    EXIT_STATUS_SUCCESS = 0
    EXIT_STATUS_FAILURE = 1

    # Trouver l'index où les importations se terminent
    import_end_index = len(lines)

    for i, line in enumerate(lines):
        if not line.strip().startswith("import "):
            import_end_index = i
            break

    # Combiner les lignes après les importations pour rechercher du Javadoc
    rest_of_code = "\n".join(
        lines[import_end_index:]
    )  # Ajout de "\n" pour garder les sauts de ligne

    # Définir le motif regex qui correspond au Javadoc
    pattern = (
        r"/\*\*(?:.|\n)*?\*/"  # Correction du motif regex pour correspondre au Javadoc
    )
    header_comment = re.search(pattern, rest_of_code, re.DOTALL)

    if header_comment:
        return EXIT_STATUS_SUCCESS

    print_error(i, f"Il manque un Javadoc dans ce fichier.")
    return EXIT_STATUS_FAILURE


def verify_ruler(lines: list[str], ruler: int) -> bool:
    success_status = EXIT_STATUS_SUCCESS

    for index, line in enumerate(lines):
        line_lenght = len(line.strip())

        if line_lenght > ruler:
            success_status = EXIT_STATUS_FAILURE
            print_error(index, f"Ligne trop longue ({line_lenght} > {ruler}).")

    return success_status


def verify_operators_spacing(lines: list[str]) -> bool:
    success_status = EXIT_STATUS_SUCCESS

    operators = (
        # Opérateurs arithmétiques
        "+", "-", "*", "/", "%",
        # Opérateurs d'affectation
        "++", "--", "=", "+=", "-=", "*=", "/=", "%=", "&=", "|=", "^=", ">>=", "<<=",
        # Opérateurs de comparaison
        "==", "!=", "!=", ">", "<", ">=", "<=",
        # Opérateurs binaires
        "&&", "||",
    )

    for index, line in enumerate(lines):
        operators_in_line = [op for op in operators if op in line]
        if (
            len(operators_in_line) > 0
            and not any(chars in line for chars in ["/*", "/**", "*/", "//"])
            and not all(f" {opil} " in line for opil in operators_in_line)
        ):
            print_error(index, f"Mauvaise aeration des operateurs.")
            success_status = EXIT_STATUS_FAILURE

    return success_status


def main(files: list[list]) -> bool:
    exit_status = EXIT_STATUS_SUCCESS

    for filename in files:
        if not os.path.exists(filename):
            print(f"Fichier introuvable : {filename}")
            raise FileNotFoundError

        # Ouverture et traitement du fichier
        print(f'Ouverture de "{filename}":')
        with open(filename, "r") as f:
            lines = f.readlines()

            if verify_javadoc(lines) == EXIT_STATUS_FAILURE:
                exit_status = EXIT_STATUS_FAILURE

            if verify_operators_spacing(lines) == EXIT_STATUS_FAILURE:
                exit_status = EXIT_STATUS_FAILURE

            if verify_ruler(lines, DEFAULT_RULER) == EXIT_STATUS_FAILURE:
                exit_status = EXIT_STATUS_FAILURE

        print(f'Fermeture de "{filename}".\n')

    return exit_status


if __name__ == "__main__":
    if len(sys.argv) != 2:
        script_name = os.path.splitext(os.path.basename(__file__))[0]
        print(f"Utilisation: python {script_name}.py file(s)")
        exit(EXIT_STATUS_FAILURE)

    file_patterns = sys.argv[1:]
    files = []

    for pattern in file_patterns:
        # Utilisation de glob pour trouver les fichiers correspondants au motif
        matching_files = glob.glob(pattern)
        files.extend(matching_files)

    if not files:
        print("Aucun fichier correspondant trouve.")
        exit(EXIT_STATUS_FAILURE)

    exit_status = main(files)
    exit(exit_status)
