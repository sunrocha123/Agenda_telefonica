# Agenda_telefonica
    #Objetivo
        Armazenar números telefônicos em uma agenda.
    #Menu
        Interação com o usuário para realização dos processos abaixo:
            #1. Criar agenda
            #2. Novo contato
            #3. Excluir contato
            #4. Atualização de contato
            #5. Exibir lista telefônica

    #Campos
        #1. Criar agenda
            Cria uma nova agenda com tamanho determinado pelo usuário. No momento da criação da agenda, são inseridos valores igual a 0, tendo em vista que o Java só permite a criação, se o tamanho informado for contemplado com valores inicialmente. Os valores igual a 0 representam espaços vazios que estão disponíveis para registro de novos telefones.

        #2. Novo contato
            Registra um novo contato na agenda. Para está ação, possui um loop que procura um elemento que seja igual a 0, para que seja feita a substituição do mesmo pelo novo contato. Lembrando que valores igual a 0 representam espaços disponíveis para registro de telefones. Caso não haja elementos igual a 0, o usuário será notificado que não possui espaço disponível na agenda, sendo necessário criar uma nova ou excluir telefones existentes.

        #3. Excluir contato
            Exclui um telefone da agenda. Caso o número exista na agenda, o mesmo será substituído por 0 (representa espaço disponível para cadastro de novo telefone). Caso contrário, o usuário será notificado que o telefone não foi localizado.

        #4. Atualização de contato
            Modifica um telefone existente na agenda. Caso o número exista na agenda, o mesmo será modificado conforme dados passados pelo usuário. Caso contrário, o usuário será notificado que o telefone não foi localizado. 

        #5. Exibir lista telefônica
            Exibe a lista telefônica de maneira ordenada para o usuário.
