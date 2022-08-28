# Backend Assessment

Build and deploy a very simple API that does the following

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/6ec19482eea94263b134c8b00875ba22)](https://www.codacy.com/gh/perowiski/age-calculator/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=perowiski/age-calculator&amp;utm_campaign=Badge_Grade)

1.  Calculate and return the age of a person, given their date of birth (dob) as query parameters to `GET /howold`

2.  Limit calls to `GET /howold` and prevent excessive usage from potentially ill-configured or malicious integrators. Only allow a maximum of 3 calls per second for each API client/caller

See full details and instructions in this [Google Doc](https://docs.google.com/document/d/1ma5vKz0j34gwI9WYrZddMM1ENlQddGOVFJ5qdSq2QlQ)
