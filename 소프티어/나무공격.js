//https://softeer.ai/practice/9657

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let n = null;
let m = null;
let cnt = 0;
const lines = [];
const inputs = [];

rl.on("line", (line) => {
  inputs.push(line);
}).on("close", () => {
  inputs.forEach((input, idx) => {
    if (idx === 0) {
      n = parseInt(input.split(" ")[0]);
      m = parseInt(input.split(" ")[1]);
    } else if (idx <= n) {
      const arr = input.split(" ");
      let sum = 0;
      arr.forEach((num) => {
        if (num === "1") sum++;
      });
      lines.push(sum);
    } else {
      const temp = input.split(" ");
      const a = parseInt(temp[0]);
      const b = parseInt(temp[1]);
      for (let i = a - 1; i < b; i++) {
        lines[i] = lines[i] - 1 <= 0 ? 0 : lines[i] - 1;
      }
    }
  });

  let sum = 0;
  for (let i = 0; i < lines.length; i++) {
    sum += lines[i];
  }
  console.log(sum);
  process.exit(0);
});
