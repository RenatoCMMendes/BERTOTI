document.addEventListener('DOMContentLoaded', function() {
    const agendaList = document.getElementById('agenda-list');
    const addAgendaForm = document.getElementById('add-agenda-form');
    let editAgendaId = null;

    // Fetch agendas on load
    fetchAgendas();

    // Add new agenda
    addAgendaForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const compromisso = document.getElementById('compromisso').value;
        addAgenda(compromisso);
    });

    // Handle edit save
    document.getElementById('save-edit-btn').addEventListener('click', function() {
        const compromisso = document.getElementById('edit-compromisso').value;
        updateAgenda(editAgendaId, compromisso);
    });

    // Fetch agendas from API
    function fetchAgendas() {
        fetch('/AgendaDiaria')
            .then(response => response.json())
            .then(agendas => {
                agendaList.innerHTML = '';
                agendas.forEach(agenda => {
                    const agendaItem = document.createElement('li');
                    agendaItem.className = 'list-group-item d-flex justify-content-between align-items-center';
                    agendaItem.innerHTML = `
                        ${agenda.compromisso}
                        <div>
                            <button class="btn btn-warning btn-sm me-2 edit-btn" data-id="${agenda.id}" data-compromisso="${agenda.compromisso}">Edit</button>
                            <button class="btn btn-danger btn-sm delete-btn" data-id="${agenda.id}">Delete</button>
                        </div>
                    `;
                    agendaList.appendChild(agendaItem);
                });

                // Add event listeners for edit and delete buttons
                document.querySelectorAll('.edit-btn').forEach(button => {
                    button.addEventListener('click', function() {
                        editAgendaId = button.getAttribute('data-id');
                        document.getElementById('edit-compromisso').value = button.getAttribute('data-compromisso');
                        $('#editAgendaModal').modal('show');
                    });
                });

                document.querySelectorAll('.delete-btn').forEach(button => {
                    button.addEventListener('click', function() {
                        const id = button.getAttribute('data-id');
                        console.log('Deleting agenda with ID:', id); // Verifique o ID no console
                        deleteAgenda(id);
                    });
                });
            })
            .catch(error => console.error('Error fetching agendas:', error));
    }

    // Add a new agenda to the API
    function addAgenda(compromisso) {
        fetch('/AgendaDiaria', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ compromisso })
        })
            .then(response => response.json())
            .then(agenda => {
                fetchAgendas(); // Refresh the list
                document.getElementById('compromisso').value = '';
            })
            .catch(error => console.error('Error adding agenda:', error));
    }

    // Update an existing agenda
    function updateAgenda(id, compromisso) {
        fetch(`/AgendaDiaria/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ id, compromisso })
        })
            .then(response => response.json())
            .then(() => {
                $('#editAgendaModal').modal('hide');
                fetchAgendas(); // Refresh the list
            })
            .catch(error => console.error('Error updating agenda:', error));
    }

    // Delete an agenda
    function deleteAgenda(id) {
        fetch(`/AgendaDiaria/${id}`, {
            method: 'DELETE'
        })
            .then(response => {
                if (response.ok) {
                    fetchAgendas(); // Refresh the list
                } else {
                    console.error('Failed to delete agenda:', response.statusText);
                }
            })
            .catch(error => console.error('Error deleting agenda:', error));
    }
});
