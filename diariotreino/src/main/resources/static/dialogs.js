(function () {
    let dialog;
    let titleElement;
    let messageElement;
    let confirmButton;
    let cancelButton;
    let activeForm;

    function createDialog() {
        dialog = document.createElement('div');
        dialog.className = 'app-dialog-overlay';
        dialog.setAttribute('role', 'dialog');
        dialog.setAttribute('aria-modal', 'true');
        dialog.setAttribute('aria-labelledby', 'app-dialog-title');
        dialog.setAttribute('aria-describedby', 'app-dialog-message');
        dialog.hidden = true;

        dialog.innerHTML = `
            <div class="app-dialog-card">
                <div class="app-dialog-icon">!</div>
                <div class="app-dialog-content">
                    <h3 id="app-dialog-title">Confirmar acao</h3>
                    <p id="app-dialog-message">Deseja continuar?</p>
                    <div class="app-dialog-actions">
                        <button type="button" class="btn btn-danger app-dialog-confirm">Confirmar</button>
                        <button type="button" class="btn btn-cancel app-dialog-cancel">Cancelar</button>
                    </div>
                </div>
            </div>
        `;

        document.body.appendChild(dialog);

        titleElement = document.getElementById('app-dialog-title');
        messageElement = document.getElementById('app-dialog-message');
        confirmButton = dialog.querySelector('.app-dialog-confirm');
        cancelButton = dialog.querySelector('.app-dialog-cancel');

        cancelButton.addEventListener('click', closeDialog);
        confirmButton.addEventListener('click', confirmAction);

        dialog.addEventListener('click', function (event) {
            if (event.target === dialog) {
                closeDialog();
            }
        });

        document.addEventListener('keydown', function (event) {
            if (!dialog.hidden && event.key === 'Escape') {
                closeDialog();
            }
        });
    }

    function openDialog(form) {
        if (!dialog) {
            createDialog();
        }

        activeForm = form;
        titleElement.textContent = form.dataset.confirmTitle || 'Confirmar acao';
        messageElement.textContent = form.dataset.confirmMessage || 'Deseja continuar?';
        confirmButton.textContent = form.dataset.confirmButton || 'Confirmar';
        cancelButton.textContent = form.dataset.cancelButton || 'Cancelar';

        dialog.hidden = false;
        dialog.classList.add('is-open');
        cancelButton.focus();
    }

    function closeDialog() {
        dialog.classList.remove('is-open');
        dialog.hidden = true;
        activeForm = null;
    }

    function confirmAction() {
        if (!activeForm) {
            closeDialog();
            return;
        }

        const form = activeForm;
        closeDialog();
        form.dataset.confirmed = 'true';
        form.submit();
    }

    document.addEventListener('submit', function (event) {
        const form = event.target;

        if (!form.dataset || !form.dataset.confirmMessage || form.dataset.confirmed === 'true') {
            return;
        }

        event.preventDefault();
        openDialog(form);
    });
})();
