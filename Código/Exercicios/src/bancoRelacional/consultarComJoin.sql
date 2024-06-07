select e.nome as Estado, c.nome as Cidade, e.regiao from estados e, cidades c
where e.id = c.estado_id; --filtro pra que ele nao faça um produto cartesiano de tudo

-- ou

select 
    e.nome as Estado, 
    c.nome as Cidade, 
    e.regiao as REgião
    from estados
    inner join cidades c on e.id = c.estado_id
