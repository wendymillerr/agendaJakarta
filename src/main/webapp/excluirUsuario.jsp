<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Excluir Contato</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Excluir Contato</h1>
    
    <div class="form-container">
        <form method="POST" action="excluirUsuarioServlet">
            <div class="form-group">
                <input type="text" name="nomeContato" placeholder="Nome do Contato">
            </div>
            <div class="form-group">
                <input type="submit" value="Excluir">
            </div>
        </form>
    </div>
</body>
</html>
