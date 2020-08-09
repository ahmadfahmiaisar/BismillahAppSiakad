package inn.mroyek.bismillahsiakad.presentation.base

import io.reactivex.disposables.CompositeDisposable

open class BasePresenter<T : BaseView> {
    protected val disposable = CompositeDisposable()
    protected var view: T? = null

    fun bind(view: T) {
        this.view = view
    }

    fun destroy() {
        if (!disposable.isDisposed)
            disposable.dispose()
        unbind()
    }

    private fun unbind() {
        this.view = null
    }
}