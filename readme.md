<h1> 🦁🐘🐒 Kata do Zoológico Multithreaded</h1>

<h2>📜 Enunciado do Desafio</h2>

<p>Você foi contratado para desenvolver um sistema de simulação de um zoológico onde diferentes animais realizam atividades simultaneamente. No entanto, o zoológico possui um número limitado de cuidadores, então os animais precisam ser organizados para que possam se alimentar e brincar sem causar confusão.
Seu objetivo é criar uma aplicação Java utilizando threads e mecanismos de sincronização para gerenciar a execução das ações dos animais de forma coordenada.</p>

<h2>🏛️ Regras do Zoológico</h2>

<h3>🦓 Os Animais:</h3>

<p>
O zoológico contém diferentes animais (por exemplo, Leão, Macaco, Elefante, Girafa).
Cada animal tem um comportamento específico, como "Comer", "Dormir" e "Brincar".
Cada animal deve executar essas atividades de forma repetitiva e assíncrona.
</p>

<h3>👩‍🌾 Os Cuidadores:</h3>

Existem apenas dois cuidadores no zoológico.
Cada cuidador pode atender somente um animal por vez.
Os animais só podem comer se um cuidador estiver disponível.

<h3>🔄 Regras de Sincronização:</h3>

Apenas dois animais podem comer ao mesmo tempo.
Animais podem brincar simultaneamente sem restrição.
Para dormir, um animal não precisa da ajuda de um cuidador.

<h3>🎯 Objetivo do Desafio</h3>

Usar threads para simular os animais realizando atividades.
Implementar sincronização com Semaphore ou synchronized para controlar os cuidadores.
Garantir que os animais consigam se alimentar respeitando a limitação dos cuidadores.


