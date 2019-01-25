Dado("que estou logado no Whatsapp") do                                         
    visit 'http://web.whatsapp.com'
    @logado = find('.iHhHL')
    expect(@logado.text).to eql "Mantenha seu telefone conectado"
end                                                                             
                                                                                
Quando("crio um novo grupo") do
    @grupoCriado = @grupo.novoGrupo
    expect(@grupoCriado.text).to eql 'Grupo criado'
end                                                                             
                                                                                
Então("posso conversar com as pessoas incluídas nesse grupo") do
    @grupo.conversaGrupo
end

Quando("seleciono o grupo") do                                                  
    @saiu = @grupo.selecionarGrupo
    expect(@saiu.text).to eql 'Saiu do grupo'
    page.has_selector?('._3j7s9 span[title="Grupo teste"]')
end                                                                             
                                                                                
Quando("clico em excluir grupo") do                                             
   @grupo.excluirGrupo
end                                                                             
                                                                                
Então("o grupo é excluido com sucesso") do    
    page.has_selector?('.f1UZe', text: 'Grupo apagado')                                
    @deletarGrupo = page.find('.f1UZe', text: 'Grupo apagado')
    expect(@deletarGrupo.text).to eql 'Grupo apagado'
end                                                                             
                                                                                