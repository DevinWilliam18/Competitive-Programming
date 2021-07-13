'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}
 
/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    const vowels = ['a','i','u','e','o'];
    let counts = 0;
    for (let index = 0; index < s.length; index++) {
        for (let charac = 0; charac < vowels.length; charac++) {
            if (vowels[charac] == s.charAt(index)) {
                console.log(s.charAt(index));
                break;
            }
        }
    }
    for (let index = 0; index < s.length; index++) {
        for (let charac = 0; charac < vowels.length; charac++) {
            if (vowels[charac] != s.charAt(index)) {
                counts++;
            }
            if(vowels[charac] == s.charAt(index)){
                counts = 0;
                break;
            }
            if(counts == 5){
                counts = 0;
                console.log(s.charAt(index));
            }
        }
    }
}



function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}
