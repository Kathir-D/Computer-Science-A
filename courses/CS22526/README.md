# CS22526 Labs Layout

Current-year CS22526 work lives here.

- `Labs/Unit1` ... `Labs/Unit12`: this year's labs
- `CodingbatLabs/`: codingbat exercises

## Compile / Run

From repo root:

```bash
scripts/labs-java.sh compile-all
scripts/labs-java.sh run CS22526.Labs.Unit12.PQTestRunner
```

To compile just one lab file (without missing-symbol package errors):

```bash
scripts/labs-java.sh compile-file courses/CS22526/Labs/Unit5/PartList.java
```

To compile a single unit:

```bash
scripts/labs-java.sh compile-unit Unit12
```

To remove all generated `.class` files:

```bash
scripts/labs-java.sh clean
```

## Previous years

Previous-year materials are archived under:

- `courses/CS2425/`

Legacy compatibility links remain under `CS/`:

- `CS/CS22526` -> `../courses/CS22526`
- `CS/CSA2425` -> `../courses/CS2425`
