function solution(phone_book) {
    return case2(phone_book);
}

function case1(phone_book){
    phone_book.sort();
    let pre = phone_book[0];
    for(let i = 1; i <phone_book.length;i++){
        if(pre === phone_book[i].substring(0,pre.length)){
            return false;
        }
        pre = phone_book[i];
    }
    return true;
}
function case2(phone_book){
    const hashmap = {};
    for(let str of phone_book){
        hashmap[str] = true;
    }
    for(const str of phone_book){
        for(let i = 1;i<str.length;i++){
            if(hashmap[str.substring(0,i)]) return false;
        }
    }
    return true;
}