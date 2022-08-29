# Peter Oziegbe

#### This project was created for the TalentQL Eligibility Assessment for Backend Engineers

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/6ec19482eea94263b134c8b00875ba22)](https://www.codacy.com/gh/perowiski/age-calculator/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=perowiski/age-calculator&amp;utm_campaign=Badge_Grade)

A small api that calculate the age of a person when a calls to `GET /howold` is made by an HTTP client.

Given their date of birth (dob) as query parameters to GET /howold, then the api calculate the age (in years) till date and return the value as part of the HTTP response object. 

Only allow a maximum of 3 calls per second from each API client/caller

## Implementation details

The design of this api follows REST architectural style that allows any HTTP client to invoke the api.

The design leverage on SpringBoot framework that allow for easy modularization of components of the application.

The implementation consists of a Controller, Service, Filter and ControllerAdvice that interact together and performs different logic in the application.

The Filter component act as interceptor and intercept every HTTP requests to verify if the maximum requests per Second has been exceeded and if so it returns HTTP status code 429("To many request"). It forward the request to the Controller component to process the client request.

The Controller component consist of an HTTP GET method that takes a query string that represent dob and performs validation and binding to a Timestamp object.

The ControllerAdvice component perform data conversion and aid the Controller to bind the querystring to a Timestamp object.

The Service performs component the logic on the timestamp and returns the years between timestamp(dob) and the current date.
