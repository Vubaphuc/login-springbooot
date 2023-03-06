const login = document.getElementById('login');
const loginBox = document.getElementById('login-box');

const API_URL = "http://localhost:8080/login";

login.addEventListener('submit', (event) => {
  event.preventDefault();

  const data = new FormData(login);
  const userName = data.get('userName');
  const password = data.get('password');
  console.log(userName);
  console.log(password);

  const fromData = {
    userName: userName,
    password: password
  };

  axios.post(API_URL,fromData)
  .then((response) => {
    const user = response.data;
    console.log(user);
    loginBox.innerHTML = "";
    loginBox.innerHTML = `<h2>Xin chào ${user.userName}</h2>
                                  <p>Email: ${user.email}</p>
                                  <p>Avatar: ${user.avatar}</p>`;
  }) 
  .catch((error) => {
    alert('Username hoặc password chưa chính xác');
    login.reset();
    document.getElementById('userName').value = '';
    document.getElementById('password').value = ''; 
  })
})

