Factory Method Pattern Example in Java

This is a simple Java implementation of the Factory Method Design Pattern. The program allows a user to choose a document type (Word, PDF, or Excel) and opens the corresponding document.

Features

    Demonstrates the Factory Method design pattern.

    Uses interface and abstract class concepts.

    Allows user input to decide the document type at runtime.
Structure

    Document - Interface with open() method.

    WordDocument, PdfDocument, ExcelDocument - Concrete implementations of Document.

    DocumentFactory - Abstract class declaring createDocument() method.

    WordDocumentFactory, PdfDocumentFactory, ExcelDocumentFactory - Concrete factories to create specific documents.

    App - Main class where user input is handled and factory method is executed.
Design Pattern Used

    Factory Method Pattern:

        Decouples object creation from its usage.

        Allows adding new document types without modifying existing logic.
