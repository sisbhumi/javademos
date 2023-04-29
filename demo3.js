//importing pre-existing module 
//accessing file system using fs module
const fs = require("fs");
fs.writeFileSync("notes.txt", "File created by nodejs.");  //creates a neww file
fs.appendFileSync("notes.txt","New line appended"); //appends into new file
