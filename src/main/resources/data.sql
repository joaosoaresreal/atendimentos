INSERT INTO empresa (id, nome, cnpj, endereco, telefone, email) VALUES 
    (1, 'JB Software', '71.115.096/0001-81', 'Rua Rio de Janeiro, 191 - Centro', '(67) 3461-5952', 'jbs.suporte2@gmail.com'),
    (2, 'Canaa Veiculos LTDA', '15.482.854/0001-29', 'Avenida Amélia Fukuda, 374 - Centro', '(67) 3461-1637', 'canaamotosnavirai@gmail.com');

ALTER SEQUENCE empresa_seq RESTART WITH 3;

INSERT INTO usuario (id, nome, senha, email, telefone) VALUES
    (1, 'Sandra Sedano', '12345678', 'sandrasedano09@gmail.com', '(67) 9 9682-9835'),
    (2, 'João Soares', '12345678', 'joao.soares@gmail.com', '(67) 9 8415-6599'),
    (3, 'Alessandra', '12345678', 'alessandra@gmail.com', '(67) 9 9898-8989');

ALTER SEQUENCE usuario_seq RESTART WITH 3;

INSERT INTO atendimento(id, prioridade, emissao, empresa_id, usuario_id) VALUES 
    (1, 1, '2023-06-22T21:44:00', 2, 2),
    (2, 3, '2023-06-22T21:45:02', 1, 1);

ALTER SEQUENCE atendimento_seq RESTART WITH 3;

INSERT INTO servico(id, nome, atendimento_id) VALUES 
    (1, 'Testar Sistema', 1),
    (2, 'Envio do XML', 2);

ALTER SEQUENCE servico_seq RESTART WITH 3;
