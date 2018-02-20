

$('#agregarbloque').on('submit', function () {

    var inicio = $('#inicio').val();
    var fins = $('#fin').val();
    var dias = $('#dias').val();

    $.post('Ingresar', {
        ini: inicio,
        fin: fins,
        dia: dias
    });
});

