// const name = require("./utils"); //importing utils module (utils.js file)
// console.log(name); //importing name

// const add = require("./utils");
// console.log(add(4,5)); //importing add function

const { name , add } = require("./utils"); //importing both together
console.log(add(1,2));
console.log(name);
