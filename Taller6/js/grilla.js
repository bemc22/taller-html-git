var ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://jsonplaceholder.typicode.com/users');

var Data;
ourRequest.onload = function(){
    var data = JSON.parse(ourRequest.responseText);
    json2table(data, dom.$table);
    console.log(data)


};

ourRequest.send();

var dom = {
  $table: $('#table'),
};

function json2table(json, $table) {
  var cols = Object.keys(json[0]);
  var headerRow = '';
  var bodyRows = '';

  function capitalizeFirstLetter(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
  }

  $table.html('<thead><tr></tr></thead><tbody></tbody>');

  cols.map(function(col) {
    headerRow += '<th>' + capitalizeFirstLetter(col) + '</th>';

  });
  json.map(function(row) {
    bodyRows += '<tr>';
    cols.map(function(colName) {
      var text = row[colName];
      var objeto = row[colName];
      var temp = typeof(objeto);

      if(colName == 'company'){
        text = '';
        nombres = Object.keys(objeto);

        text = objeto[nombres[0]];
      }else if (colName=='address') {
        text = '';
        nombres = Object.keys(objeto);
        nombres.map(  function(nom){
          if ( (typeof(objeto[nom]) != 'object' ) && nom != 'zipcode') {
            text += objeto[nom] + ' ';        }
        });
      }
      bodyRows += '<td>' + text + '</td>';
    })
    bodyRows += '</tr>';
  });

  $table.find('thead tr').append(headerRow);
  $table.find('tbody').append(bodyRows);
}


function filtrar(number, name_id) {
      var input, filter, table, tr, td, i, txtValue;

      // input = document.getElementById(name_id);
      input = $("#" + name_id)[0];
      filter = input.value.toUpperCase();
      table = $("#table")[0];
      tr =  $(table).find("tr");
      for (i = 0; i < tr.length; i++) {
        td = $(tr[i]).find("td")[number];
        if (td) {
          txtValue = td.textContent || td.innerText;
          if (txtValue.toUpperCase().indexOf(filter) > -1) {
            tr[i].style.display = "";
          } else {
            tr[i].style.display = "none";
          }
        }
      }
    }
