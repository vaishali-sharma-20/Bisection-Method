# Bisection-Method
Here, Code of Bisection Method of Computer Oriented Numerical Methods in Java Language.The bisection method is an approximation method to find the roots of the given equation by repeatedly dividing the interval. This method will divide the interval until the resulting interval is found, which is extremely small.
# Project title

Bisection Method


## Motivation

A University Assignment. Clearly Used to Solve anhy Porblem and Perform Computer Oriented Prolblems .


## Method and results

start

2. Define function f(x)
3. Choose initial guesses a and b such that f(a)f(b) < 0
4. Choose pre-specified tolerable error e.
5. Calculate new approximated root as m = (a + b)/2
6. Calculate f(a)f(m)
	a. if f(a)f(m) < 0 then x0 = x0 and x1 = x2
	b. if f(a)f(m) > 0 then x0 = x2 and x1 = x1
	c. if f(a)f(m) = 0 then goto (8)
7. if |f(m)| > e then goto (5) otherwise goto (8)

8. Display m as root.
9. Stop

## Repository overview

Provide an overview of the directory structure and files, for example:

├── README.md
├── data
├── gen
│   ├── analysis
│   ├── data-preparation
│   └── paper
└── src
    ├── analysis
    ├── data-preparation
    └── paper



## More resources

referenced from Computer oriented Numerical Method Book By Rajaraman


## About

You can say it has been part of a class you've taken at International Institute of Professional Studies, Indore.

