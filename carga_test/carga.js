const axios = require('axios');

const apiUrl = 'http://localhost:8080/api/producer/send';
const numberOfRequests = 50;
const postData = {
    message: 'Hello, API!',
    content: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.',
  };

async function makePostRequest() {
  try {
    const response = await axios.post(apiUrl, postData);
    console.log(`Status: ${response.status}`);
  } catch (error) {
    console.error(`Erro: ${error.message}`);
  }
}

async function runLoadTest() {
  console.log(`Iniciando ${numberOfRequests} solicitações...`);

  const requests = Array.from({ length: numberOfRequests }, () => makePostRequest());
  await Promise.all(requests);

  console.log('Teste de carga concluído.');
}

runLoadTest();
