const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputs = [];
rl.on("line", (line) => {
  inputs.push(line);
}).on("close", () => {
  const numArr = inputs[0].split(" ")[1];
  const limit = parseInt(inputs[0].split(" ")[1], 10);
  let arr = new Array(limit + 1).fill(0);

  for (let i = 1; i < inputs.length; i++) {
    const temp = inputs[i].split(" ");
    const w = parseInt(temp[0], 10);
    const v = parseInt(temp[1], 10);
    for (let nowW = limit; nowW >= w; nowW--) {
      arr[nowW] = Math.max(arr[nowW], arr[nowW - w] + v);
    }
  }
  console.log(arr[limit]);
  process.exit(0);
});
