const numarr1 = [2, 0, 3, 4, 1];
const numarr2 = [2, 0, 3, 4, 1];
const objArr = [
    { id: 2, nema: 'Led' },
    { id: 0, nema: 'Green' },
    { id: 3, nema: 'Yellow' },
    { id: 4, nema: 'Blue' },
    { id: 1, nema: 'White' }
];

numarr1.sort(function(a, b) {
    return a - b;
});
numarr2.sort(function(a, b) {
    return b - a;
});

console.log(`${numarr1}`);
console.log(`${numarr2}`);
console.log(objArr);