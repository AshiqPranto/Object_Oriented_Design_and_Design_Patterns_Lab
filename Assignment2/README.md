# Pet Management System

## Overview

The Pet Management System is a console application that allows users to manage various pets owned by a single owner. Users can add different types of pets, such as cats, dogs, and birds, along with their names and ages. All pet data is stored on behalf of the owner. The application provides the option to display pet information based on the user's selection.

## Key Features

- **Owner Class**: The system introduces an `IOwner` interface to define the functionality of the owner class. This interface ensures a consistent structure for owner-related operations.

- **Pet Hierarchy**: A generalized class named `Pet` serves as the base class for all specific pet types (e.g., Cat, Dog, Bird). This inheritance structure allows for uniform management of various pets.

## Functionality

The Pet Management System offers the following functionality:

- **Adding Pets**: Users can add pets of different types, providing details like the pet's name and age.

- **Owner Management**: The system manages pet data on behalf of the owner.

- **Displaying Pets**: Users can select the type of pet they want to view, and the application displays relevant pet information.

