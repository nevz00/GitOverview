package net.git.overview;

public class BaseEntuty {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntuty{" +
                "id=" + id +
                '}';
    }
    public boolean isNew(){
         return (this.id==null);
    }
}
