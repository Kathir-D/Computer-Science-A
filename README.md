# Computer Science A
### AP Computer Science A assigments from apluscompsci
### CS2 labs and assigments

---

## How Everything Is Organized

- `courses/CS22526/`: current CS2 labs
- `courses/CS22526/Labs/Unit#`: lab units
- `courses/CS22526/CodingbatLabs/`: Codingbat labs
- `courses/CS2425/`: All the CSA labs
- `scripts/labs-java.sh`: helper scripts to compile/run labs correctly

## Run Labs Locally

From repo root:

Click the run button while on the runner in your IDE

Or

Use command line:
```bash
scripts/labs-java.sh compile-all
scripts/labs-java.sh compile-unit Unit12
scripts/labs-java.sh compile-file courses/CS22526/Labs/Unit5/PartList.java
scripts/labs-java.sh run CS22526.Labs.Unit12.PQTestRunner
scripts/labs-java.sh clean
```

## How To Upload New Labs

1. Add files to the correct unit folder (example: `courses/CS22526/Labs/Unit8/`)
2. Ensure package lines match the folder path
3. Compile before uploading:

## IntelliJ / VS Code Notes

- Source root should be `courses` (not `courses/CS22526`)
- If IntelliJ shows class-not-found errors, rebuild the project
- `.class` files are ignored by git and should not be committed
