INSERT INTO empresa (id, nome, cnpj, endereco, telefone, email) VALUES 
    (1, 'JB Software', '71.115.096/0001-81', 'Rua Rio de Janeiro, 191 - Centro', '(67) 3461-5952', 'jbs.suporte2@gmail.com'),
    (2, 'Canaa Veiculos LTDA', '15.482.854/0001-29', 'Avenida Amélia Fukuda, 374 - Centro', '(67) 3461-1637', 'canaamotosnavirai@gmail.com');

ALTER SEQUENCE empresa_seq RESTART WITH 3;
