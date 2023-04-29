const name = "Mike";
// module.exports = name; //exporting it so it can be imported

const add = function(num1, num2){
    return num1 + num2 ;
};

// module.exports = add; // only add is exported in both exports (line 2 and 8)

module.exports = {name , add}; //making both objcts available