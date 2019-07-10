Dado(/^eu estou na tela Conversas \(featureNovoGrupo\)$/) do
  touch("* id:'btnChat'")
end

Quando(/^eu pressiono o botao Opcoes \(featureNovoGrupo\)$/) do
  touch("* id:'btnOptions'")
end

E(/^eu inicio a criacao de um novo grupo \(featureNovoGrupo\)$/) do
  touch("* id:'btnNewGroup'")
end

E(/^eu pressiono o botao Próximo \(featureNovoGrupo\)$/) do
  touch("* id:'btnNext'")
end

Então(/^eu aguardo ser exibida a mensagem de verificacao "([^"]*)" \(featureNovoGrupo\)$/) do |verificationMessage|
  wait_for_text("#{verificationMessage}")
end

E(/^eu seleciono o contato "([^"]*)" \(featureNovoGrupo\)$/) do |selectContact|
  touch("* text:'#{selectContact}'") 
end

E(/^eu digito o nome do novo grupo "([^"]*)" \(featureNovoGrupo\)$/) do |newGroup|
  enter_text "* id:'editNewGroup'", "#{newGroup}"
end

E(/^eu pressiono Ok \(featureNovoGrupo\)$/) do
  touch("* id:'btnOk'")
end