Dado("que estou logado no Whatsapp Web") do
    @logado = @whatsapp.acessarPagina
    sleep 1
    expect(@logado.text).to eql "Mantenha seu telefone conectado"
end
  
Quando("crio uma nova conversa") do
  @whatsapp.novaConversa
    
end

Então("posso conversar com a pessoa") do
    @whatsapp.enviaMensagem
end

Quando("seleciono uma conversa já existente") do
    @whatsapp.selecionaConversa
end

Quando("enviei mensagem para uma pessoa") do
@mensagem = "mensagem a ser apagada...."

  @whatsapp.enviaMensagemPessoa(@mensagem)
end

Quando("clico em apagar conversa") do

    @whatsapp.apagaMensagem(@mensagem)
   
end

Então("a mensagem é apagada do Whatsapp") do
    @deleted = @whatsapp.confirmaMensagemApagada
    expect(@deleted.text).to eql "1 mensagem apagada"
end

# $('._2DNgV._1i1U7._1UyGF')