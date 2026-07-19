async function getFact() {
    const response = await fetch("/api/facts/random");

    const data = await response.json();

    document.getElementById("fact").innerText = data.fact;
}
