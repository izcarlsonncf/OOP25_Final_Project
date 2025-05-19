# READ ME

### Description
* I chose to do the virtual pet simulator for my final project. I created a base class, Pet, and then extended Cat, Dog, and Alien Cat off of Pet.
* This project allows you to feed and play with the pet. You can also click a 'tick' button to simulate the passing of time.
* The pet dies if its hunger reaches 100 or its happiness reaches 0.

### DISCLAIMER
* The JavaFX GUI set-up only utilizes Alien Cat. If you wanted to have a cat or dog instead, you'd have to edit the new Pet = new *AlienCat* line in src/main/java/com.example.oop25_final_project/PetAppController and manually change the image that is set in src/main/resources/petapp.fxml. Only one image src/main/resources/gleebus.png exists in this repo. 

### SOURCES
* Oracle documentation for setting up button actions
   * https://docs.oracle.com/javase/8/javafx/api/javafx/fxml/doc-files/introduction_to_fxml.html#fxml_annotation
* Adding an image
   * https://stackoverflow.com/questions/63646114/display-image-in-javafx-using-fxml
* Base petapp.fxml and PetApplication.java are modified from the default HelloApplication and helloapplication.fxml files created by IntelliJ when making a new JavaFX project
* Alien cat drawing by me :) 
* ChatGPT for debugging
