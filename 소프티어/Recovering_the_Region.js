const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputs = [];
rl.on("line", (line) => {
  inputs.push(line);
}).on("close", () => {
  const n = parseInt(inputs[0], 10);
  for (let i = 0; i < n; i++) {
    let arr = "";
    const num = (i % 2) + 1;
    for (let j = 0; j < n; j++) {
      arr += num + " ";
    }
    console.log(arr.slice(0, arr.length - 1));
  }
  process.exit(0);
});
