
let url = 'https://www.datos.gov.co/resource/xdk5-pm3f.json';

window.onload = function(){
  $dep = $('#dep');
  let deps = new Set([]);
  fetch(url)
    .then(function(response) {
      return response.json();
    })
    .then(function(myJson) {
      myJson.forEach((item, i) => {
          value = item.departamento;
          if(!deps.has(value)){
            new_dep = document.createElement("option");
            new_dep.text = value;
            new_dep.text = value;
            $dep.append(new_dep);
            deps.add(value);
          }
      });
    });
  }

  function change_mun(dep){
    $mun = $('#mun');
    $mun.empty();
    primer = document.createElement("option");
    primer.text = 'Municipio';
    $mun.append(primer);

    new_url = url + '?departamento=' + dep.value;
    fetch(new_url)
      .then(function(response) {
        return response.json();
      })
      .then(function(myJson) {
          myJson.forEach((item, i) => {
            value = item.municipio;
            new_mun = document.createElement("option");
            new_mun.text = value;
            $mun.append(new_mun);
          });
      });
  }
