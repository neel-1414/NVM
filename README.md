# NVM
# Custom Virtual Machine (VM)

A learning-focused, stack-based Virtual Machine implemented from scratch to understand how low-level execution models work.  
The VM interprets custom bytecode and executes basic arithmetic operations.

This project is inspired by studying how runtimes like the JVM execute bytecode, with a simplified design for educational purposes.

---

## 🎯 Goals to Reach

### Core Language Pipeline
- [//] Scanner (Lexer) — tokens, keywords, literals, comments
- [ ] Parser — grammar rules, precedence, error recovery
- [ ] Compiler — AST → Bytecode / IR
- [ ] Symbol Table — variable scope & bindings
- [ ] Basic Type System — numbers, strings, booleans, nil


---

## Current Features

- Stack-based execution model
- Custom bytecode format
- Instruction pointer for sequential execution
- Arithmetic operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Runtime operand stack management
- Bytecode interpretation loop

---

## Architecture Overview

- **VM** – Core execution engine
- **Chunk / Bytecode** – Stores instructions and constants
- **Opcode** – Defines instruction set
- **Stack** – Used for operand evaluation
- **Main** – Entry point for execution

---

