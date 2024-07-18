// 트리 노드 정의
class TreeNode {
    constructor(val) {
        this.val = val;
        this.children = [];
    }
}

// 역방향 DFS 함수 정의
function reverseDFS(node, level, result) {
    if (!node) return;

    // 리프 노드인 경우
    if (node.children.length === 0) {
        if (!result[level]) {
            result[level] = [];
        }
        result[level].push(node.val);
        return;
    }

    // 자식 노드에 대해 재귀적으로 탐색
    for (const child of node.children) {
        reverseDFS(child, level + 1, result);
    }

    // 현재 노드를 방문
    if (!result[level]) {
        result[level] = [];
    }
    result[level].push(node.val);
}

// 예시 트리 생성
const root = new TreeNode(1);
const node2 = new TreeNode(2);
const node3 = new TreeNode(3);
const node4 = new TreeNode(4);
const node5 = new TreeNode(5);
const node6 = new TreeNode(6);
const node7 = new TreeNode(7);

root.children = [node2, node3, node4];
node2.children = [node5, node6];
node4.children = [node7];

// 리프에서부터 위로 단계별로 탐색 결과를 저장할 배열
let result = [];

// 역방향 DFS 호출
reverseDFS(root, 0, result);

// 결과 출력
console.log("단계별 탐색 결과:");
for (let i = result.length - 1; i >= 0; i--) {
    console.log(`Level ${i}:`, result[i]);
}
