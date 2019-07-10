Quando(/^eu pressiono o botao Busca \(featureBusca\)$/) do
  touch("* id:'btnSearch'")
end

E(/^eu digito o nome do contato "([^"]*)" \(featureBusca\)$/) do |contactName|
  enter_text "* id:'editContact'", "#{contactName}"
end

Então(/^eu aguardo ser exibida a mensagem de verificacao "([^"]*)" \(featureBusca\)$/) do |verificationMessage|
  step %Q{eu aguardo ser exibida a mensagem de verificacao "#{verificationMessage}" (featureNovoGrupo)}
end

E(/^eu aguardo ser exibido o contato "([^"]*)" \(featureBusca\)$/) do |contact|
  wait_for_text("#{contact}")
end

Então(/^eu seleciono o contato "([^"]*)" \(featureBusca\)$/) do |selectContact|
   step %Q{eu seleciono o contato "#{selectContact}" (featureNovoGrupo)} 
end