/**
 * Livros controller 
 * 
 * @param $scope
 * @param $http
 * @param Livros
 */
function LivrosController($scope, $http, Livros) {

    // Define a refresh function, that updates the data from the REST service
    $scope.refresh = function() {
        $scope.livros = Livros.query();
    };

    // Define a reset function, that clears the prototype newLivro object, and
    // consequently, the form
    $scope.reset = function() {
        // clear input fields
        $scope.newLivro = {};
    };

    // Define a register function, which adds the member using the REST service,
    // and displays any error messages
    $scope.register = function() {
        $scope.successMessages = '';
        $scope.errorMessages = '';
        $scope.errors = {};

        Livros.save($scope.newLivro, function(data) {

            // mark success on the registration form
            $scope.successMessages = [ 'Livro cadastrado com sucesso' ];

            // Update the list of livros
            $scope.refresh();

            // Clear the form
            $scope.reset();
        }, function(result) {
            if ((result.status == 409) || (result.status == 400)) {
                $scope.errors = result.data;
            } else {
                $scope.errorMessages = [ 'Erro no servidor desconhecido' ];
            }
            $scope.$apply();
        });

    };

    // Call the refresh() function, to populate the list of livros
    $scope.refresh();

    // Initialize newLivro here to prevent Angular from sending a request
    // without a proper Content-Type.
    $scope.reset();

    // Set the default orderBy to the name property
    $scope.orderBy = 'nome';
}


/**
 * Home controller 
 * 
 * @param $scope
 * @param $http
 * @param Livros
 */
function HomeControler($scope, $http, Livros) {


    // Define a refresh function, that updates the data from the REST service
    $scope.refresh = function() {
        $scope.livros = Livros.query();
    };

    // Define a reset function, that clears the prototype newLivro object, and
    // consequently, the form
    $scope.reset = function() {
        // clear input fields
        $scope.newLivro = {};
    };

    // Define a register function, which adds the member using the REST service,
    // and displays any error messages
    $scope.register = function() {
        $scope.successMessages = '';
        $scope.errorMessages = '';
        $scope.errors = {};

        Livros.save($scope.newLivro, function(data) {

            // mark success on the registration form
            $scope.successMessages = [ 'Livro cadastrado com sucesso' ];

            // Update the list of livros
            $scope.refresh();

            // Clear the form
            $scope.reset();
        }, function(result) {
            if ((result.status == 409) || (result.status == 400)) {
                $scope.errors = result.data;
            } else {
                $scope.errorMessages = [ 'Erro no servidor desconhecido' ];
            }
            $scope.$apply();
        });

    };

    // Call the refresh() function, to populate the list of livros
    $scope.refresh();

    // Initialize newLivro here to prevent Angular from sending a request
    // without a proper Content-Type.
    $scope.reset();

    // Set the default orderBy to the name property
    $scope.orderBy = 'nome';
}