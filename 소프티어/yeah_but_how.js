//https://softeer.ai/practice/9498

// 1. (를 만나면 현재 스택이 비어있는지 확인한다.
// 1-1. 만약 있다면 ')' 가 들어가 있다면 + 를 붙인다.
// 1-2. 그게 아니면 스택에 ( 를 넣는다.

// 2. )를 만나면 스택에서 하나를 꺼낸다.
// 2-1. 꺼낸게 ( 인 경우 '1' 을 넣고 )를 넣는다.

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputs = [];
rl.on("line", (line) => {
  const input = line.split("");
  let answer = "";
  const stack = [];
  input.forEach((char, idx) => {
    if (char === "(") {
      if (stack.length === 0) {
        stack.push(char);
      } else if (stack[stack.length - 1] === ")") {
        stack.push("+");
        stack.push(char);
      } else {
        stack.push(char);
      }
    } else if (char === ")") {
      if (stack[stack.length - 1] === "(") {
        stack.push("1");
      }
      stack.push(char);
    }
  });
  stack.forEach((char) => {
    answer += char;
  });
  console.log(answer);
}).on("close", () => {
  process.exit(0);
});
