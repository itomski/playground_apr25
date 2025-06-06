

function machWas(a, b, f) {
    f(a + b);
}

let machWasAnderes = function(v) {
    console.log(v);
}

machWasAnderes(100);

machWas(20, 35, machWasAnderes)

machWas(20, 35, function(v) {
    // Ausgabe in der GUI
})