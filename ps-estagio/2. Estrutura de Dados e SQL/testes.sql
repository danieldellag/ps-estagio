/*  Buscar os nomes de todos os alunos que frequentam alguma turma do professor 'JOAO PEDRO'. */
select A.Nome
from ALUNO A, PROFESSOR P, TURMA T
where A.id = T.ALUNO_id and
      P.id = T.PROFESSOR_id and
      P.nome = 'JOAO PEDRO';

/*Buscar os dias da semana que tenham aulas da disciplina 'MATEMATICA'. */
select dia_da_semana
from DISCIPLINA D, TURMA T
where T.DISCIPLINA_id = D.id and
      D.nome = 'MATEMATICA';

/*    Buscar todos os alunos que frequentem aulas de 'MATEMATICA' e também 'FISICA'.*/
select D.Nome
from ALUNO A, DISCIPLINA D, TURMA T
where T.ALUNO_id = A.id and
      T.DISCIPLINA_id = D.id and
      D.nome = 'MATEMATICA' in (select D.Nome
                                from ALUNO A, DISCIPLINA D, TURMA T
                                where T.ALUNO_id = A.id and
                                      T.DISCIPLINA_id = D.id and
                                      D.nome = 'FISICA');

/*Buscar as disciplinas que não tenham nenhuma turma.*/
select D.nome
from DISCIPLINA D, TURMA T
where D.id = T.DISCIPLINA_id and
      T.id = NULL;

/*Buscar os alunos que frequentem aulas de 'MATEMATICA' exceto os que frequentem 'QUIMICA'.*/
select A.Nome
from ALUNO A, DISCIPLINA D, TURMA T
where T.DISCIPLINA_id = D.id and
      D.nome = 'MATEMATICA' except (select A.Nome
                                    from ALUNO A, DISCIPLINA D, TURMA T
                                    where T.DISCIPLINA_id = D.id and
                                          D.nome = 'QUIMICA');
