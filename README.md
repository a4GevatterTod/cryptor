# cryptor
A small command-line tool to fool around on social media.
It uses a quite simple algorithm to cypher your messages. Only those who have the power of 
seeing a base64 encoding with a bit-flip in a String will be able to read it. 
Or if they know this litte app. 

## installation

### build yourself 
- install java jdk > 11
- install maven3
- install git-client
- clone repo 
- run  `mvn - clean package` in the project directory

### use prebuild binary
- download latest cryptor-x.x.x.jar from https://github.com/a4GevatterTod/cryptor/releases

##usage
- cd to the directory containing the jar file
- run `java -jar cryptor-x.x.x.jar` Substitute the x'es with the project number
- type `help` to see available commands

![Alt text](doc/files/cryptor-usage.png?raw=true "Title") 
