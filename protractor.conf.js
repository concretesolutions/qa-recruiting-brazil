//conf.js
exports.config = {
    seleniumAddress: 'http://localhost:4444/wd/hub',
    specs: ['./e2e/features/*.feature'],
    capabilities: {
        'browserName': 'chrome'
    },
    cucumberOpts: {
        require: [
            './e2e/features/step_definitions/*.js',
        ],
        tags: ["@changeName"], // Seleciona o cenario ou na feature que vai ser executado
        strict: true, // O teste falha se estiver faltando algum step
    },
    framework: 'custom', // Configurado como custom porque sera usado o cucumber que nao e mais nativo do protractor.
    frameworkPath: require.resolve('protractor-cucumber-framework'),
    // Para executar e decifrar a linguagem Gherkin
    onPrepare: function() {
        browser.manage().window().maximize();
        const { Given, Then, When, Before } = require('cucumber');
        global.Given = Given;
        global.When = When;
        global.Then = Then;
        global.Before = Before;
    }
}