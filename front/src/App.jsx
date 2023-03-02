import './App.css';
import { useState } from 'react';

function App() {
  const [login, setLogin] = useState('')
  const [password, setPassword] = useState('')

  const handleSubmit = () => {
    let data = JSON.stringify({
      login,
      password
    },null,2)

    fetch('http://localhost/api/hello-world', {
      method: 'POST',
      body: data
    }).then(data => {
        console.log(data)
    })
  }

  return (
    <div className="App">
      <input type="email" placeholder='login' value={login} onChange={(event)=>{setLogin(event.currentTarget.value)}} />
      <input type='password' placeholder='pass' value={password} onChange={(event)=>{setPassword(event.currentTarget.value)}}/>
      <button onClick={handleSubmit}>submit</button>
    </div>
  );
}

export default App;
