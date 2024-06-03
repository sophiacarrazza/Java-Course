update estados 
st nome = 'Maranhão'
where sigla = 'MA'

select nome from estados where sigla = 'MA'
-- select nome ou estados.nome ou 'nome' ou estados.'nome'

update `estados`
    set nome = 'Paraná',
        populacao = 11.32
    where sigla  = 'PR'

select nome, sigla, populacao from estados where sigla = 'PR'
