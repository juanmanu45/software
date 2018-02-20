function doList() {
    //start ajax request
    console.log("HOLA MUNDO");
    $.ajax({
        url: "list",
        //force to handle it as text
        dataType: "text",
        success: function (data) {

            
            var json = $.parseJSON(data);
          
            console.log(json);

            

            for (var i = 0; i < json.length; ++i)
            {   
                var html = '<tr>\n';
                html+='<td>'+json[i].id_+'</td>\n';
                html+='<td>'+json[i].firstName+'</td>\n';
                html+='<td>'+json[i].lastName+'</td>\n';
                html+='<td>'+json[i].category+'</td>\n';
                html+='</tr>\n\n';
                
                $('#mitabla').append(html);
            }
        }
    });
}
