<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tela de Cadastro</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="form-container">
        <form action="cadastroServlet" method="post">
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input type="text" id="nome" name="nome" required>
            </div>

            <div class="form-group">
                <label for="telefoneCelular">Telefone Celular:</label>
                <input type="text" id="telefoneCelular" name="telefoneCelular">
            </div>

            <div class="form-group">
                <label for="telefoneResidencial">Telefone Residencial:</label>
                <input type="text" id="telefoneResidencial" name="telefoneResidencial">
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="dataNascimento">Data de Nascimento:</label>
                <input type="text" id="dataNascimento" name="dataNascimento">
            </div>

            <div class="form-group">
                <input type="submit" value="Cadastrar">
                <input type="reset" value="Limpar">
                <input type="hidden" name="operacao" value="cadastrar">
            </div>
        </form>
    </div>
</body>
</html>
