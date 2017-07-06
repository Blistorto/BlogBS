package br.com.blog.control;

import br.com.blog.model.business.Viewer;
import br.com.blog.model.dao.ViewerDAO;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("subscribeBean")
@RequestScoped
public class SubscribeController extends AbstractController {

    @Inject
    private ViewerDAO viewerDAO;

    @Inject
    private Viewer viewer;

    public String saveSubscriber() {
        viewerDAO.save(viewer);
        return "";
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

}
