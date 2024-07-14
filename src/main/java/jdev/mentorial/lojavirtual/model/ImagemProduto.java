/*
 * package jdev.mentorial.lojavirtual.model;
 * 
 * import java.io.Serializable; import jakarta.persistence.Entity; import
 * jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.ManyToOne;
 * 
 * @Entity public class ImagemProduto implements Serializable {
 * 
 * private static final long serialVersionUID = 1L;
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.SEQUENCE) private Long id; private
 * String imagemOriginal; private String imagemMiniatura;
 * 
 * @ManyToOne private Produto produto;
 * 
 * public ImagemProduto() { super(); }
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public String getImagemOriginal() { return imagemOriginal; }
 * 
 * public void setImagemOriginal(String imagemOriginal) { this.imagemOriginal =
 * imagemOriginal; }
 * 
 * public String getImagemMiniatura() { return imagemMiniatura; }
 * 
 * public void setImagemMiniatura(String imagemMiniatura) { this.imagemMiniatura
 * = imagemMiniatura; }
 * 
 * public Produto getProduto() { return produto; }
 * 
 * public void setProduto(Produto produto) { this.produto = produto; }
 * 
 * }
 */