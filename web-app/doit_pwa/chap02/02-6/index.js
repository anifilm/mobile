let myObj = { "name": "홍길동", "age": 35, "email": "sjyou@somedomain.com" };

strJSON = JSON.stringify(myObj);
console.log(strJSON);

newObj = JSON.parse(strJSON)
console.log(newObj);
