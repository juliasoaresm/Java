<!-- .github/copilot-instructions.md - guidance for AI coding agents working in this repo -->
# Copilot / AI Agent Instructions

Purpose: short, actionable guidance so an AI agent can be productive immediately in this repository.

**Quick Summary**
- **Project type:** single-file Java example in repository root.
- **Key file:** `teste.java` contains a public class `SwitchComString` (see note below).

**Quick Start (concrete commands)**
- To compile after renaming the source to match the public class:

```
javac SwitchComString.java
java SwitchComString
```

- If you try to `javac teste.java` you will likely get the compiler error:

```
error: class SwitchComString is public, should be declared in a file named SwitchComString.java
```

Actionable first tasks for an AI agent
- Rename `teste.java` -> `SwitchComString.java` so the filename matches the `public class SwitchComString`.
- After renaming, run the two commands above to verify compilation and runtime behavior.
- Keep all strings and messages in Portuguese unless asked otherwise (this repo's example uses Portuguese outputs).

Project overview and discoverable patterns
- The repo currently contains a single example: a Java program demonstrating `switch` on `String` values.
- The program uses the default (unnamed) package and prints Portuguese messages for each case.

Developer workflows & expectations
- There is no build tool (Maven/Gradle) detected. Use `javac`/`java` for compile/run.
- Tests and CI are not present. If requested, propose adding a simple `pom.xml` or `build.gradle` and unit tests with JUnit.

Conventions an AI should follow here
- Preserve Portuguese text in user-facing strings unless the user asks for translation.
- Fix local, discoverable issues (e.g., filename mismatch) rather than adding scaffolding without permission.
- When adding packages, update directory layout accordingly (e.g., `package com.example;` -> place sources in `com/example/`).

Examples from the codebase
- `teste.java` (current file) contains:

```java
public class SwitchComString {
    public static void main(String[] args) {
        String diaDaSemana = "Segunda";
        switch (diaDaSemana) { ... }
    }
}
```

Notes about merging/updating existing instructions
- If `.github/copilot-instructions.md` already exists, preserve any project-specific notes and merge these concrete commands and the filename-mismatch note into the existing document.

What I (the AI) should ask before larger changes
- Permission to rename `teste.java` to `SwitchComString.java`.
- Permission to add a build tool (Maven/Gradle) and tests.

If anything above is unclear, ask the repo owner for clarification before making larger structural changes.
